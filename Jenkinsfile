pipeline {
    agent {
        docker { image 'gradle:6.0.1-jdk8'}
    }

    stages {
        stage('Compile') {
            steps {
                sh 'gradle build'
            }
        }

        stage('Unit Tests') {
            steps {
                sh 'gradle test'
            }
        }

        stage('Upload Artifact') {
            steps {
                rtUpload (
                    serverId: 'Main-Artifactory',
                    spec: '''
                        {"files": [
                            {
                                "pattern": "./build/libs/keysMaster-*.jar",
                                "target": "Keys-Master/org/"
                            }
                        ]}
                    ''',
                    failNoOp: true
                )
            }
        }
    }
}
