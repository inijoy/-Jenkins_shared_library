def call() {
    sh 'trivy image adminhijo/youtube:latest > trivyimage.txt'
}
