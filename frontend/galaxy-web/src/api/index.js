import axios from "axios"

const api = axios.create({
  baseURL: "/api",
  timeout: 5 * 1000
})

api.interceptors.request.use(
  config => {
    config.headers['Content-Type'] = 'application/json'
    return config
  },
  error => {
    Promise.reject(error)
  }
)

api.interceptors.response.use(
  response => {
    if (response.data.errorCode != 0) {
      throw "error code: " + response.data.errorCode + ", message: " + response.data.errorMessage
    }
    return response.data.data
  },
  error => {
    return Promise.reject(error)
  }
)

export default api
