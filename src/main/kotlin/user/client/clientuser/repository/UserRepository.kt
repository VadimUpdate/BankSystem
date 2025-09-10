package user.client.clientuser.repository

import org.springframework.data.jpa.repository.JpaRepository
import user.client.clientuser.entity.User

interface UserRepository : JpaRepository<User, Long>