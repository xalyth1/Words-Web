package pl.com.words;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {

//    @Bean
//    //@Profile("setup")
//    CommandLineRunner initUsers(UserManagementRepository repository) {
//        return args -> {
//            repository.save(new UserAccount("alicja", "password", "ROLE_USER"));
//            repository.save(new UserAccount("robert", "password", "ROLE_USER"));
//            repository.save(new UserAccount("pawel", "password", "ROLE_ADMIN"));
//        };
//    }

    @Bean
    UserDetailsService userService(UserRepository repo) {
        return username -> repo.findByUsername(username).asUser();
    }

    @Bean
    SecurityFilterChain configureSecurity(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/login").permitAll()
                        .requestMatchers("/", "/search").authenticated()
                        .anyRequest().denyAll())
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());
        return http.build();
    }
}
