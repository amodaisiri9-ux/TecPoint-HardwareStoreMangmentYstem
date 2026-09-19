package control;

import java.sql.SQLException;
import model.User;
import model.UserDAO;

public class UserController {
    private final UserDAO dao = new UserDAO();

    public boolean addUser(User user) throws SQLException {
        return dao.addUser(user);
    }
}
