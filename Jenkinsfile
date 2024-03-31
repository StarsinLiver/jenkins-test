pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // Git 저장소에서 소스 코드 체크아웃
                git url: 'https://github.com/StarsinLiver/jenkins-test.git', branch: 'main'
            }
        }
        stage('Build') {
            steps {
                // Gradle 빌드 실행
                sh 'chmod +x gradlew'
                sh './gradlew build'
            }
        }
        stage('Transfer Artifacts') {
            steps {
                // 빌드된 파일을 원격 서버로 전송
                sh 'scp -r ./build/libs/*.war centos@192.168.111.100:/home/centos/build'
            }
        }
    }
    post {
        success {
            // 성공적으로 푸시한 경우 실행되는 작업
            echo 'Changes pushed successfully!'
        }
        failure {
            // 푸시 실패 시 실행되는 작업
            echo 'Push failed! Please check the logs.'
        }
    }
}
