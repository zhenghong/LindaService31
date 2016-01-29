package com.lm.mes;

import com.taobao.metamorphosis.client.extension.spring.DefaultMessageListener;
import com.taobao.metamorphosis.client.extension.spring.MetaqMessage;
import java.util.Date;

public class DateMessageListener extends DefaultMessageListener<Date> {

    @Override
    public void onReceiveMessages(MetaqMessage<Date> msg) {
        Date date = msg.getBody();
        System.out.println("receive date message:" + date);
    }

}