package hui.service.impl;

import hui.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public Boolean verify(String username, String password) {
        return username.equals("root") && password.equals("root");
    }
}
