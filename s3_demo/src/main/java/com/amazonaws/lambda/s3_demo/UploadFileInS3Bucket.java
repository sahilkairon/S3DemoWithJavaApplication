package com.amazonaws.lambda.s3_demo;

import java.io.File;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

public class UploadFileInS3Bucket {

	
	public static void main(String[] args) {
		final AmazonS3 S3 = AmazonS3ClientBuilder.defaultClient();
		String BucketName = "fingerPrintBucket";
//		key is the file name that will be given to the bucket
		String Key = "demofile.txt";
		
		String FilePath = "/D/user/demofile.txt";
		
		try {
			S3.putObject(BucketName, Key, new File(FilePath));
		}catch(AmazonServiceException e) {
			System.exit(1);
			
		}
		
	}
}
