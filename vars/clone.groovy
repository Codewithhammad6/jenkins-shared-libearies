def call(String url, String branch) {
    echo 'Cloning code from GitHub'
    git branch: branch, url: url
}
