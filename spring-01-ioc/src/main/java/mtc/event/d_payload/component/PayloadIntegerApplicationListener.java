package mtc.event.d_payload.component;

import org.springframework.context.ApplicationListener;
import org.springframework.context.PayloadApplicationEvent;

public class PayloadIntegerApplicationListener implements ApplicationListener<PayloadApplicationEvent<Integer>> {
    @Override
    public void onApplicationEvent(PayloadApplicationEvent<Integer> event) {
        System.out.println("监听到PayloadApplicationEvent[Integer] ------> " + event.getPayload());
    }
}
