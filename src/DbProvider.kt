interface DbProvider{
    fun getStudentById(id: Int): Student?= TODO()
    fun getStudentsByCourseId(courseId: Int): List<Student> = TODO()
    fun getCourseById(courseId: Int): Course? = TODO()
    fun getCoursesByDepartmentId(departmentId: Int): List<Course>? = TODO()
    fun getAllDepartmentID(): List<Department> = TODO()
    fun countStudentsHasSkill(skillType: SkillType): Int = TODO()

}