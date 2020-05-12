package youtube;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.util.MimeTypeUtils;

import javax.persistence.*;

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
