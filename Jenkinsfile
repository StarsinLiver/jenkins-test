pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // Git 저장소에서 소스 코드 체크아웃
                git url: 'https://github.com/StarsinLiver/jenkins-test.git', branch: 'main'
            }
        }
        stage('Modify') {
            steps {
                // 파일 수정 등의 작업 수행
                writeFile file: 'myfile.txt', text: 'Modified content'
            }
        }
        stage('cp file') {
            steps {
                // 파일을 가상 머신의 로컬 디렉토리로 복사
                sh 'ssh centos@192.168.111.100'
                sh 'centos'
                sh 'scp -r ./myfile.txt centos@192.168.111.100:/home/centos'
                sh 'centos'
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
