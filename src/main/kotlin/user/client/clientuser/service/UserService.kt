package user.client.clientuser.service

import org.springframework.stereotype.Service
import user.client.clientuser.entity.User
import user.client.clientuser.repository.UserRepository

@Service
class UserService(private val userRepository: UserRepository) {
    fun saveUser(user: User): User = userRepository.save(user)

    fun getUserById(id: Long): User? = userRepository.findById(id).orElse(null)
}