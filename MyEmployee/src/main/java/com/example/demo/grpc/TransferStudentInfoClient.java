package com.example.demo.grpc;

import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.example.demo.grpc.helloworld.GreeterGrpc;
import com.example.demo.grpc.helloworld.GreeterGrpc.GreeterBlockingStub;
import com.example.demo.grpc.helloworld.Transferstudentinfo.HelloReply;
import com.example.demo.grpc.helloworld.Transferstudentinfo.HelloRequest;
import com.google.protobuf.ByteString;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@Component
public class TransferStudentInfoClient {
	private static final Logger LOGGER =
		      LoggerFactory.getLogger(TransferStudentInfoClient.class);
//	@PostConstruct
//	 private void init() {
//	    ManagedChannel managedChannel = ManagedChannelBuilder
//	        .forAddress("localhost", 9999).usePlaintext().build();
//
//	    GreeterBlockingStub greetStub = GreeterGrpc.newBlockingStub(managedChannel);
//	}
	
	
	ManagedChannel managedChannel = ManagedChannelBuilder
	        .forAddress("localhost", 9999).usePlaintext().build();

	    GreeterBlockingStub greetStub = GreeterGrpc.newBlockingStub(managedChannel);
	    	

	  public String sayHello(long id, String name, String phone , byte[] photo) {
		  ByteString bString = ByteString.copyFrom(photo);
		  HelloRequest hellorequest = HelloRequest.newBuilder().setId(id).setName(name).setPhone(phone).setPhoto(bString).build();
		  HelloReply helloReply = null;
		  helloReply = greetStub.sayHello(hellorequest);
		  return helloReply.getMessage();
	  }

}
