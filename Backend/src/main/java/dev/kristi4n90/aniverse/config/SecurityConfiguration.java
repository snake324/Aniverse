package dev.kristi4n90.aniverse.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception{

        http.cors(withDefaults())
                .csrf(csfr -> csfr.disable())
                //.formLogin(form -> form.disable())
                .logout(out -> out
                        .logoutUrl("/logout")
                        .deleteCookies("JSESSIONID"))
                .authorizeHttpRequests(auth -> auth
                    .requestMatchers("/register", "/anime/**", "/genre/**").permitAll()
                    .requestMatchers("/users").hasRole("USER")
                    .anyRequest().authenticated())
                .httpBasic(withDefaults())
                .sessionManagement(session -> session
                        .sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED));
        return http.build();
    }

    @Bean
    CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowCredentials(true);
        configuration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE"));
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {

        UserDetails luffy = User.builder()
                .username("luffy")
                .password("{bcrypt}$2a$12$SnIc0lskG/qyHSTWT8vpNOVQyaN5XxO2peQ8mqrepLv41vRv/GHhe")
                .roles("USER")
                .build();

        UserDetails cristian = User.builder()
                .username("cristian")
                .password("{bcrypt}$2a$12$S1MB85LjsOxWffqdKo31u.AboEK8MIhKduOjEam3e1n.BCHBENfMW")
                .roles("ADMIN")
                .build();

        Collection<UserDetails> users = new ArrayList<>();
                users.add(luffy);
                users.add(cristian);

        return new InMemoryUserDetailsManager(users);

    }
}
