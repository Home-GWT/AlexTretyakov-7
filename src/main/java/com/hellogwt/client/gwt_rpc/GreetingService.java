package com.hellogwt.client.gwt_rpc;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.hellogwt.shared.domain.Greeting;

import java.util.ArrayList;

@RemoteServiceRelativePath("springGwtServices/greetingService")
public interface GreetingService extends RemoteService {

    Greeting getGreeting(String text);

    void addGreeting(String author, String text);

    void updateGreeting(String author, String text);

    void deleteGreeting(String text);

    ArrayList<Greeting> getGreetings();
}