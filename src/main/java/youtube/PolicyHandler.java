package youtube;

import youtube.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverCheckedRefund_CheckRefundPolicy(@Payload CheckedRefund checkedRefund){

        if(checkedRefund.isMe()){
            System.out.println("##### listener CheckRefundPolicy : " + checkedRefund.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverUploadedVideo_CheckPolicy(@Payload UploadedVideo uploadedVideo){

        if(uploadedVideo.isMe()){
            System.out.println("##### listener CheckPolicy : " + uploadedVideo.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverEditedVideo_CheckPolicy(@Payload EditedVideo editedVideo){

        if(editedVideo.isMe()){
            System.out.println("##### listener CheckPolicy : " + editedVideo.toJson());
        }
    }

}
