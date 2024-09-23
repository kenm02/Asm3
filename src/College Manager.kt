class SchoolBd(): DbProvider {
    val instructors = listOf<Instructor>(
        Instructor(1, "Math", "Jackson", "Michal", "Nick", "03492123412"),
        Instructor(2, "Sience", "Jackson", "Smith", "Joe", "03493423434"),
        Instructor(3, "a", "Jackson", "Smith", "Mike", "034934222523")
    )
    val departments = listOf<Department>(
        Department(10, "Y", "GenX tower"),
        Department(11, "G", "GenZ tower"),
        Department(12, "H", "GenY tower")
    )
    val courses = listOf<Course>(
        Course(123, "Y", 1, 8, "JAVASCRIPT"),
        Course(124, "G", 2, 14, "KOTLIN")
    )
    val students = listOf<Student>(
        Student(1, "Mike", "Joe", "033495734534"),
        Student(2, "Potter", "Hary", "033495723424"),
        Student(3, "Smith", "Haly", "033495432343"),
        Student(4, "Pike", "Slum", "03349765424"),
    )
    val courses_students = listOf<Course_Student>(
        Course_Student(123, 1),
        Course_Student(123, 2),
        Course_Student(123, 3),
        Course_Student(123, 4),
        Course_Student(124, 1),
        Course_Student(124, 2),
        Course_Student(124, 3),
        Course_Student(124, 4),

        )

    override fun getStudentById(id: Int): Student? = students.find { it.id == id }
    override fun getStudentsByCourseId(courseId: Int): List<Student> = students.filter { it.id == courseId }
    override fun getCourseById(courseId: Int): Course? = courses.find { it.id == courseId }
    override fun getCoursesByDepartmentId(departmentId: Int): List<Course> = courses.filter { it.id == departmentId }
    override fun countStudentsHasSkill(skillType: SkillType): Int {
       val courseId = courses.find { it.name.uppercase() == skillType.name }?.id?: return 0
        return courses_students.count { it.courseId == courseId }
    }
}
fun main() {
    val dbProvider :DbProvider = SchoolBd()
    val student = dbProvider.getStudentById(1)
    println(student)
    val count = dbProvider.countStudentsHasSkill(SkillType.KOTLIN)
    println(count)
}