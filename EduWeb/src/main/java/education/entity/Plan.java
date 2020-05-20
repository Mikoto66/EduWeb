package education.entity;

public class Plan {
    private MasterPlan[] provincePlan;
    private MajorPlan[] majorPlan;

    public MasterPlan[] getProvincePlan() {
        return provincePlan;
    }

    public void setProvincePlan(MasterPlan[] provincePlan) {
        this.provincePlan = provincePlan;
    }

    public MajorPlan[] getMajorPlan() {
        return majorPlan;
    }

    public void setMajorPlan(MajorPlan[] majorPlan) {
        this.majorPlan = majorPlan;
    }
}
