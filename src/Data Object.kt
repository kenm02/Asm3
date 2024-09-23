data class Instructor(
    val id: Int,
    val department: String,
    val headedBy: String,
    val firstName: String,
    val lastName: String,
    val phone: String
)
data class Department(
    val Id: Int,
    val name: String,
    val location: String
)
data class Course(
    val id: Int,
    val department: String,
    val instructorID: Int,
    val duration: Int,
    val name: String
)
data class Student(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val phone: String
)
data class Course_Student(
    val courseId: Int,
    val studentId: Int
)