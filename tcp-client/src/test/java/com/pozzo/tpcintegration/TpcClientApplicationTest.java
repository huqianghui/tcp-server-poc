package com.pozzo.tpcintegration;

import java.util.Date;

import com.pozzo.tpcintegration.client.TcpClientConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pozzo.tpcintegration.client.TcpClientGateway;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TpcClientApplicationTest {

	@Autowired
	private TcpClientGateway tcpClientGateway;

	@Autowired
	TcpClientConfig config;

	@Test
	public void test() {
		for (int i = 0; i < 5; i++) {
			String serverResponse = tcpClientGateway.send("Test Message " + new Date());
			System.out.println(String.format("### test Response from  %s:  ### No.  %d:  ### context: %s", config.clientConnectionFactory().getHost(),i, serverResponse));
			Assert.assertNotNull(serverResponse);
		}
	}
}
