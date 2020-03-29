package org.minio;

import io.minio.MinioClient;
import io.minio.errors.*;
import io.minio.messages.Bucket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class MinioConnection {

    private static final MinioClient CLIENT;
    private static final Logger logger = LoggerFactory.getLogger(MinioConnection.class);
    private static final Map<String, List<String>> CACHE = new HashMap<>();

    static {
        try {
            CLIENT = new MinioClient("http://localhost:9000", "minioadmin", "minioadmin");
            logger.debug("Connected successfully to minio server");

            initWorkspace();
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
    }

    private static void initWorkspace() throws IOException, InvalidKeyException, NoSuchAlgorithmException, InsufficientDataException, InvalidResponseException, InternalException, NoResponseException, InvalidBucketNameException, XmlPullParserException, ErrorResponseException {
        final List<Bucket> buckets = CLIENT.listBuckets();
    }

    private MinioConnection() {}

}
