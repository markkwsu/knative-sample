# knative-sample
這次的 Lab，開發機器是使用 Mac 完成驗證的，Windows 機器在 Docker 的部分有一些要注意的地方，請先參閱 [https://docs.docker.com/docker-for-windows/install/](https://docs.docker.com/docker-for-windows/install/)

需要準備什麼
- GCP 帳號，有 gmail 就可以試用 （[https://cloud.google.com](https://cloud.google.com)）
- Redhat sandbox 帳號開通 （[https://developers.redhat.com/developer-sandbox](https://developers.redhat.com/developer-sandbox)）會傳簡訊至台灣手機驗證，有時候會失敗，先搶先贏！
- Docker 帳號，用來將範例程式 image 上傳到 docker hub

會使用到的 GCP 服務
- Cloud Run
- Container Registry

會使用到的 OCP 服務
- Serverless

開發機器上需要先安裝的軟體與環境
-   Java SDK 8
-   Docker Desktop（[https://www.docker.com/products/docker-desktop](https://www.docker.com/products/docker-desktop)）
-   Google Cloud SDK（[https://cloud.google.com/sdk](https://cloud.google.com/sdk)）
-   Apache Maven（[https://maven.apache.org/](https://maven.apache.org/)）如果不用 Eclipse 就需要它
-   Eclipse for JavaEE（[https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2022-06/R/eclipse-jee-2022-06-R-macosx-cocoa-x86_64.dmg](https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2022-06/R/eclipse-jee-2022-06-R-macosx-cocoa-x86_64.dmg)）如果有裝 Eclipse 就不需要 Maven
- 配置好 Docker push 到 GCP Container Registry，參考：[https://cloud.google.com/container-registry/docs/pushing-and-pulling](https://cloud.google.com/container-registry/docs/pushing-and-pulling)

# 兩個範例程式
- Knative Serving
- Knative Eventing

# 三個部署情境
- GCP Cloud Run Knative Serving
- OCP Knative Serving
- OCP Knative Eventing