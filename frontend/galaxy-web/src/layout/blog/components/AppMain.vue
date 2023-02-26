<script setup>
import { useRouter,useRoute } from 'vue-router'
var key = useRoute().path
</script>

<template>
  <section class="app-main">
    <RouterView :key="key" />
  </section>
</template>

<style scoped>
</style>
