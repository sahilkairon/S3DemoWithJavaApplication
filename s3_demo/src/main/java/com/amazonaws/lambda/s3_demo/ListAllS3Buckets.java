package com.amazonaws.lambda.s3_demo;

import java.util.List;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;

public class ListAllS3Buckets {
	
	public static void main(String [] args) {
		final AmazonS3 s3 = AmazonS3ClientBuilder.defaultClient();
		List<Bucket> b = s3.listBuckets();
		
		for(Bucket bk :b) {
			System.out.println( "* "+ bk.getName());
		}
		
		
	}

}
