pipeline {
    agent { label 'master' }
    stages {
       stage('build') {
          steps {
             bat 'echo step1'
             bat 'echo step2'
             bat '''
                echo 'Multiline'
                echo 'Example'
             '''
             echo 'not using shell'
          }
       }
    }
}