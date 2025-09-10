package user.client.clientuser.controller

import org.springframework.web.bind.annotation.*
import user.client.clientuser.entity.User
import user.client.clientuser.service.UserService

@CrossOrigin(origins = ["http://localhost:3000"])
@RestController
@RequestMapping("/users")
class UserController(private val userService: UserService) {

    @PostMapping
    fun createUser(@RequestBody user: User): User {
        return userService.saveUser(user)
    }

    @GetMapping("/{id}")
    fun getUserById(@PathVariable id: Long): User? {
        return userService.getUserById(id)
    }
}
