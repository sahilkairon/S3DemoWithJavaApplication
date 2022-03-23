package com.amazonaws.lambda.s3_demo;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.AmazonS3Exception;

public class createBucket {

	
	public static void main(String [] args) {
		final AmazonS3 s3 = AmazonS3ClientBuilder.defaultClient();
		
		String bucketname = "fingerprint_bucket";
		
		try {
			s3.createBucket(bucketname);
		}catch(AmazonS3Exception e) {
			System.out.println(e.getErrorMessage());
			
		}
	}
}
