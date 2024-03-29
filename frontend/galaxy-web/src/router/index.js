import { createRouter, createWebHistory } from 'vue-router'
import { BlogLayout } from '@/layout'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: () => import('@/views/Home.vue')
    },
    {
      path: '/blog',
      name: 'blog',
      component: BlogLayout,
      children: [
        {
          path: 'all',
          component: () => import('@/views/blog/All.vue')
        }
      ]
    },
  ]
})

export default router
