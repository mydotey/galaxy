<script setup>
import { useRoute } from 'vue-router'
var key = useRoute().path
</script>

<template>
  <div class="col-lg-8 entries">
    <RouterView :key="key" />
    <div class="blog-pagination">
      <ul class="justify-content-center">
        <li><a href="#">1</a></li>
        <li class="active"><a href="#">2</a></li>
        <li><a href="#">3</a></li>
      </ul>
    </div>

  </div><!-- End blog entries list -->
</template>

<style scoped>
</style>
