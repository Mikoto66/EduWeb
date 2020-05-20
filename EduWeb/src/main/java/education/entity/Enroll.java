package education.entity;

public class Enroll {
    private int stuId;
    private int[] universityId;
    private int[] department;

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public int[] getUniversityId() {
        return universityId;
    }

    public void setUniversityId(int[] universityId) {
        this.universityId = universityId;
    }

    public int[] getDepartment() {
        return department;
    }

    public void setDepartment(int[] department) {
        this.department = department;
    }
}
