pipeline {
  agent any
  stages {
    stage('was anderes') {
      steps {
        git(url: 'https://github.com/kikiSt/tictactoe', branch: 'master')
      }
    }
    stage('') {
      steps {
        mail(subject: 'uwu', body: 'OWO', from: 'kristina.stojimirovic@bluewin.ch', to: 'jens.scheidmann@nyp.ch')
      }
    }
  }
}