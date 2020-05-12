package youtube;

import org.springframework.beans.BeanUtils;

import javax.persistence.*;

@Entity
@Table(name="PolicyManagement_table")
public class PolicyManagement {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long policyId;
    private Long refundPolicy;
    private String deleteVideoName;
    private Integer violationCount;
    private Long deleteVideoId;

    @PrePersist
    public void onPrePersist(){
//        CheckedPolicy checkedPolicy = new CheckedPolicy();
//        BeanUtils.copyProperties(this, checkedPolicy);
//        checkedPolicy.publishAfterCommit();
//        System.out.println("checkedPolicy :  " +checkedPolicy);
//
//        ModifiedPolicy modifiedPolicy = new ModifiedPolicy();
//        BeanUtils.copyProperties(this, modifiedPolicy);
//        modifiedPolicy.publishAfterCommit();
//        System.out.println("modifiedPolicy :  " +modifiedPolicy);
//
//        CheckedRefundPolicy checkedRefundPolicy = new CheckedRefundPolicy();
//        BeanUtils.copyProperties(this, checkedRefundPolicy);
//        checkedRefundPolicy.publishAfterCommit();
//        System.out.println("checkedRefundPolicy :  " +checkedRefundPolicy);
    }

    @PostRemove
    public void onPostRemove(){
        DeletedPolicy deletedPolicy = new DeletedPolicy();
        BeanUtils.copyProperties(this, deletedPolicy);
        deletedPolicy.publishAfterCommit();
    }


    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }
    public Long getRefundPolicy() {
        return refundPolicy;
    }

    public void setRefundPolicy(Long refundPolicy) {
        this.refundPolicy = refundPolicy;
    }
    public String getDeleteVideoName() {
        return deleteVideoName;
    }

    public void setDeleteVideoName(String deleteVideoName) {
        this.deleteVideoName = deleteVideoName;
    }
    public Integer getViolationCount() {
        return violationCount;
    }

    public void setViolationCount(Integer violationCount) {
        this.violationCount = violationCount;
    }

    public Long getDeleteVideoId() {
        return deleteVideoId;
    }

    public void setDeleteVideoId(Long deleteVideoId) {
        this.deleteVideoId = deleteVideoId;
    }
}
