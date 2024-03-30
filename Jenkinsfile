pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // Git 저장소에서 소스 코드 체크아웃
                git url: 'https://github.com/StarsinLiver/jenkins-test.git'
            }
        }
        stage('Modify') {
            steps {
                // 파일 수정 등의 작업 수행
                writeFile file: 'myfile.txt', text: 'Modified content'
            }
        }
        stage('Commit and Push') {
            steps {
                // 수정한 파일을 스테이징하고 커밋
                sh 'git add .'
                sh 'git commit -m "Update file"'
                
                // 커밋한 내용을 원격 저장소로 푸시
                sh 'git push origin main'
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
