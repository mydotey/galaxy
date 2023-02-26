<script setup>
import { Navbar } from './components'
import { AppMain } from './components'
import { Sidebar } from './components'

import '@/assets/blog/vendor/animate.css/animate.min.css'
import '@/assets/blog/vendor/bootstrap/css/bootstrap.min.css'
import '@/assets/blog/vendor/bootstrap-icons/bootstrap-icons.css'
import '@/assets/blog/vendor/boxicons/css/boxicons.min.css'
import '@/assets/blog/vendor/glightbox/css/glightbox.min.css'
import '@/assets/blog/vendor/swiper/swiper-bundle.min.css'
import '@/assets/blog/main.css'

import Aos from "aos"
import "aos/dist/aos.css"

import { onMounted } from 'vue'
onMounted(() => {
  Aos.init()
})

</script>

<template>
  <Navbar />
  <section id="blog" class="blog">
    <div class="container" data-aos="fade-up">
      <div class="row">
        <AppMain />
        <Sidebar />
      </div>
    </div>
  </section>
</template>
