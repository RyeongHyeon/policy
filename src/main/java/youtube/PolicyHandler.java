package youtube;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import youtube.config.kafka.KafkaProcessor;

import java.security.Policy;

@Service
public class PolicyHandler{

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverCheckedRefund_CheckRefundPolicy(@Payload CheckedRefund checkedRefund){
        if(checkedRefund.isMe()){
            if(checkedRefund.getTotalView()>5){
                System.out.println("############# 1000만원 환급이 가능합니다.#################");
            }
            System.out.println("##### listener CheckRefundPolicy : " + checkedRefund.toJson());
        }

    }


    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverUploadedVideo_CheckPolicy(@Payload UploadedVideo uploadedVideo){



        if(uploadedVideo.isMe()){
            if(uploadedVideo.getVideoId()!=null){
                System.out.println("############# 동영상 업로드가 가능합니다 ################");
            }
            System.out.println("##### listener CheckPolicy : " + uploadedVideo.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverEditedVideo_CheckPolicy(@Payload EditedVideo editedVideo){



        if(editedVideo.isMe()){
            if(editedVideo.getVideoId()!=null){
                System.out.println("############# 동영상 수정이 가능합니다 ################");
            }
            System.out.println("##### listener CheckPolicy : " + editedVideo.toJson());
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverAdRegistered_CheckPolicy(@Payload AdRegistered adRegistered){

        if(adRegistered.isMe()){
            if(adRegistered.getAdId()!=null){
                System.out.println("############# 광고 등록이 가능합니다. ################");

            }
            System.out.println("##### listener CheckPolicy : " + adRegistered.toJson());
        }
    }

}
