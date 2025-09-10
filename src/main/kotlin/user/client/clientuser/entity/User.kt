package user.client.clientuser.entity

import jakarta.persistence.*

@Entity
@Table(name = "users") // не 'user'
data class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val name: String,
    val email: String
)