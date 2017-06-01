package com.c2.p2.AWS1;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3ObjectSummary;

public class App 
{
    	private static final String SUFFIX = "/";
        public static void main( String[] args )
        {
        	AWSCredentials credentials = new BasicAWSCredentials("AKIAINKBU76EQC3DNDHA", "sW9R6AaovQbpYmgT5ABpHw6mVmGsdJ0gEd+b5FzF");
    	    AmazonS3 s3client = new AmazonS3Client(credentials);
    	    
    	    String bucketName = "ezdi-integration-bucket";
    	    String folderName = "ezcac/client_data/rajesh"; 
    	    String fileName = folderName + SUFFIX + "test1.txt";
    	    
    	    
    	    s3client.putObject(new PutObjectRequest(bucketName, fileName, 
    	    		new File("/home/local/EZDI/rajesh.d/Downloads/s3.txt")));
    	    System.out.println("uploaded");
    	    }
}
