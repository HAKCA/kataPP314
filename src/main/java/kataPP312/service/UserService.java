package kataPP312.service;

import kataPP312.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> findAll();
    User getById(Long id);
    User findUserByUsername(String username);

    void save(User user);

    void deleteById(Long id);

    void update(User user);

    @Override
    UserDetails loadUserByUsername(String s) throws UsernameNotFoundException;
}