package education.entity;

public class Target {
    private int stuId;
    private int[] schoolId;
    private int[][] major;

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public int[] getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int[] schoolId) {
        this.schoolId = schoolId;
    }

    public int[][] getMajor() {
        return major;
    }

    public void setMajor(int[][] major) {
        this.major = major;
    }
}
