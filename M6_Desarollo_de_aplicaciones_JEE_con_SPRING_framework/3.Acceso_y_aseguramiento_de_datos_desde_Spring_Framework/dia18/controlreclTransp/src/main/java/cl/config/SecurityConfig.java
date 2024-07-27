package cl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	private final UserDetailsService userDetailsService;

    public SecurityConfig(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        
    	http.authorizeHttpRequests(authorizeRequests ->
                authorizeRequests
                        .requestMatchers("/css/**", "/js/**", "/","/usuario/iniciarSesion", "/usuario/registrarse","/h2-console/**","/login.do**").permitAll()
                        .anyRequest().authenticated()
        )
    	.formLogin(formLogin ->
        formLogin
            .loginPage("/usuario/iniciarSesion")
            .loginProcessingUrl("/usuario/iniciarSesion")
            .defaultSuccessUrl("/usuario/home", true) // Redirige a /usuario/home después de un inicio de sesión exitoso
            .permitAll()
    )

        .logout(logout ->
                logout
                        .permitAll()
        )
        .csrf(csrf -> csrf.disable())
        .headers(headers -> headers.frameOptions(frameOptions -> frameOptions.sameOrigin()));
        return http.build();
    }
    
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
