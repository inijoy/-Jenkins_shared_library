def call() {
    withKubeConfig([credentialsId: 'kubeconfig']) {
        sh "kubectl delete -f deployment.yml"
    }
}