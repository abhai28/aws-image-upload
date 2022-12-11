package com.example.awsimageupload.buckets;

public enum BucketName {
    PROFILE_Image("abhai-image-upload");
    private final String bucketName;


    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
