package youtube;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="PolicyManagement_table")
public class PolicyManagement {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String policyId;
    private Long refundPolicy;
    private String deleteVideoName;
    private Integer violationCount;

    @PrePersist
    public void onPrePersist(){
        CheckedPolicy checkedPolicy = new CheckedPolicy();
        BeanUtils.copyProperties(this, checkedPolicy);
        checkedPolicy.publishAfterCommit();


        ModifiedPolicy modifiedPolicy = new ModifiedPolicy();
        BeanUtils.copyProperties(this, modifiedPolicy);
        modifiedPolicy.publishAfterCommit();


        CreatedPolicy createdPolicy = new CreatedPolicy();
        BeanUtils.copyProperties(this, createdPolicy);
        createdPolicy.publishAfterCommit();


        CheckedRefundPolicy checkedRefundPolicy = new CheckedRefundPolicy();
        BeanUtils.copyProperties(this, checkedRefundPolicy);
        checkedRefundPolicy.publishAfterCommit();


    }


    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
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




}
