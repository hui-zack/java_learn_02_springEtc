package hui.controller;

import hui.domain.User;
import hui.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public boolean add(@RequestBody User user) {
        return userService.add(user);
    }

    @PutMapping
    public boolean update(@RequestBody User user) {
        return userService.update(user);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        return userService.delete(id);
    }

    @GetMapping("/{id}")
    public User selectById(@PathVariable Integer id) {
        return userService.selectById(id);
    }

    @GetMapping
    public List<User> selectAll() {
        return userService.selectAll();
    }
}
