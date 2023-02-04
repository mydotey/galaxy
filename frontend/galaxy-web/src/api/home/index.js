import api from "@/api"

const baseURL = "/home"

export function hello(name) {
  return api({
    url: baseURL + '/hello',
    method: 'get',
    params: {
	name
    }
  })
}
