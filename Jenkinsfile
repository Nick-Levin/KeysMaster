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

        stage('Execute') {
            steps {
                sh 'gradle run'
            }
        }

//      WD = /var/lib/jenkins/workspace/KeyMaster_nightly
        stage('Upload Artifact') {
            steps {
                rtUpload (
                    serverId: 'Main-Artifactory',
                    spec: '''
                        {"files": [
                            {
                                "pattern": "./build/libs/*.jar",
                                "target": "Keys-Master/org/keysMaster-.jar"
                            }
                        ]}
                    ''',
                    failNoOp: true
                )
            }
        }
    }
}
