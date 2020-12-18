def MUTABLE_VAR = "1"

pipeline {

	agent any
	
	stages {
		stage('Execute') {
			steps {
				script {
					MUTABLE_VAR = sh(script: 'echo abc', returnStdout: true)
				}
				sh "echo \"Something value is ${MUTABLE_VAR}\""
			}
		}
	}
}
