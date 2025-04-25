/*
* ✅ Rule of Thumb:
Ask yourself: "If one of these methods changes, is it likely the others need to change too?"
If yes → they are related.
If no → they should probably be separated.
* */
package Lesson1_SingleResponsibilityPrinciple.TakeHomeTask;
class Student {
    // Student-related properties and methods
}

// Handles student enrollment
class StudentEnrollmentService {
    public void enrollStudent(Student student) {
        // Code for student enrollment
    }
}

// Handles class scheduling
class ClassScheduler {
    public void scheduleClasses() {
        // Code to schedule classes
    }
}

// Handles teacher payroll
class SalaryManager {
    public void manageTeacherSalaries() {
        // Code for managing teacher salaries
    }
}

// Handles school infrastructure maintenance
class InfrastructureManager {
    public void maintainSchoolInfrastructure() {
        // Code for maintaining infrastructure
    }
}

public class SchoolManagerSolutionSRP {
}
