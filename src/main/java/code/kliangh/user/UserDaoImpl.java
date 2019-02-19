package code.kliangh.user;

import org.springframework.stereotype.Service;

@Service
public class UserDaoImpl implements UserDao {
    @Override
    public String getMessage() {
        return "JSF 2 + Spring Integration";
    }
}
