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

        stage('Upload Artifact') {
            steps {
                sh 'pwd; ls -l -R'
                rtUpload (
                    serverId: 'Main-Artifactory',
                    spec: """
                        "files": [
                            {
                                "pattern": "/var/lib/jenkins/workspace/KeyMaster_nightly/build/libs/keysMaster.jar",
                                "target": "Keys-Master/org/"
                            }
                        ]
                    """,
                    failNoOp: true
                )
            }
        }
    }
}
